import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'timePlayedEvent', header: 'timePlayedEvent', defaultFlex: 1 },
  { name: 'timePlayedTotal', header: 'timePlayedTotal', defaultFlex: 1 },
  { name: 'timePlayedEventAverage', header: 'timePlayedEventAverage', defaultFlex: 1 },
  { name: 'eventsPlayed', header: 'eventsPlayed', defaultFlex: 1 },
  { name: 'eventsStarted', header: 'eventsStarted', defaultFlex: 1 },
  { name: 'positionId', header: 'positionId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'corepersonstats/selectAll',{
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

const CorePersonStats = () => {
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

export default CorePersonStats;