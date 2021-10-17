import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'doublePlays', header: 'doublePlays', defaultFlex: 1 },
  { name: 'triplePlays', header: 'triplePlays', defaultFlex: 1 },
  { name: 'putouts', header: 'putouts', defaultFlex: 1 },
  { name: 'assists', header: 'assists', defaultFlex: 1 },
  { name: 'errors', header: 'errors', defaultFlex: 1 },
  { name: 'fieldingPercentage', header: 'fieldingPercentage', defaultFlex: 1 },
  { name: 'defensiveAverage', header: 'defensiveAverage', defaultFlex: 1 },
  { name: 'errorsPassedBall', header: 'errorsPassedBall', defaultFlex: 1 },
  { name: 'errorsCatchersInterference', header: 'errorsCatchersInterference', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballdefensivestats/selectAll',{
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

const BaseballDefensiveStats = () => {
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

export default BaseballDefensiveStats;