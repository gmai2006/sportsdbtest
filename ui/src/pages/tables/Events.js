import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'eventKey', header: 'eventKey', defaultFlex: 1 },
  { name: 'publisherId', header: 'publisherId', defaultFlex: 1 },
  { name: 'startDateTime', header: 'startDateTime', defaultFlex: 1 },
  { name: 'siteId', header: 'siteId', defaultFlex: 1 },
  { name: 'siteAlignment', header: 'siteAlignment', defaultFlex: 1 },
  { name: 'eventStatus', header: 'eventStatus', defaultFlex: 1 },
  { name: 'duration', header: 'duration', defaultFlex: 1 },
  { name: 'attendance', header: 'attendance', defaultFlex: 1 },
  { name: 'lastUpdate', header: 'lastUpdate', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'events/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const Events = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default Events;