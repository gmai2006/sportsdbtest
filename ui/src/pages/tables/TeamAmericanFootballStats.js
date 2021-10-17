import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'yardsPerAttempt', header: 'yardsPerAttempt', defaultFlex: 1 },
  { name: 'averageStartingPosition', header: 'averageStartingPosition', defaultFlex: 1 },
  { name: 'timeouts', header: 'timeouts', defaultFlex: 1 },
  { name: 'timeOfPossession', header: 'timeOfPossession', defaultFlex: 1 },
  { name: 'turnoverRatio', header: 'turnoverRatio', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'teamamericanfootballstats/selectAll',{
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

const TeamAmericanFootballStats = () => {
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

export default TeamAmericanFootballStats;