import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'score', header: 'score', defaultFlex: 1 },
  { name: 'scoreOpposing', header: 'scoreOpposing', defaultFlex: 1 },
  { name: 'scoreAttempts', header: 'scoreAttempts', defaultFlex: 1 },
  { name: 'scoreAttemptsOpposing', header: 'scoreAttemptsOpposing', defaultFlex: 1 },
  { name: 'scorePercentage', header: 'scorePercentage', defaultFlex: 1 },
  { name: 'scorePercentageOpposing', header: 'scorePercentageOpposing', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'corestats/selectAll',{
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

const CoreStats = () => {
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

export default CoreStats;