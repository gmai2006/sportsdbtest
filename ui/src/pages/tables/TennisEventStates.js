import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'eventId', header: 'eventId', defaultFlex: 1 },
  { name: 'currentState', header: 'currentState', defaultFlex: 1 },
  { name: 'sequenceNumber', header: 'sequenceNumber', defaultFlex: 1 },
  { name: 'tennisSet', header: 'tennisSet', defaultFlex: 1 },
  { name: 'game', header: 'game', defaultFlex: 1 },
  { name: 'serverPersonId', header: 'serverPersonId', defaultFlex: 1 },
  { name: 'serverScore', header: 'serverScore', defaultFlex: 1 },
  { name: 'receiverPersonId', header: 'receiverPersonId', defaultFlex: 1 },
  { name: 'receiverScore', header: 'receiverScore', defaultFlex: 1 },
  { name: 'serviceNumber', header: 'serviceNumber', defaultFlex: 1 },
  { name: 'context', header: 'context', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'tenniseventstates/selectAll',{
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

const TennisEventStates = () => {
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

export default TennisEventStates;