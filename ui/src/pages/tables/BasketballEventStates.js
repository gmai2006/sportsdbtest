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
  { name: 'periodValue', header: 'periodValue', defaultFlex: 1 },
  { name: 'periodTimeElapsed', header: 'periodTimeElapsed', defaultFlex: 1 },
  { name: 'periodTimeRemaining', header: 'periodTimeRemaining', defaultFlex: 1 },
  { name: 'context', header: 'context', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'basketballeventstates/selectAll',{
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

const BasketballEventStates = () => {
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

export default BasketballEventStates;