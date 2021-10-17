import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'tacklesTotal', header: 'tacklesTotal', defaultFlex: 1 },
  { name: 'tacklesSolo', header: 'tacklesSolo', defaultFlex: 1 },
  { name: 'tacklesAssists', header: 'tacklesAssists', defaultFlex: 1 },
  { name: 'interceptionsTotal', header: 'interceptionsTotal', defaultFlex: 1 },
  { name: 'interceptionsYards', header: 'interceptionsYards', defaultFlex: 1 },
  { name: 'interceptionsAverage', header: 'interceptionsAverage', defaultFlex: 1 },
  { name: 'interceptionsLongest', header: 'interceptionsLongest', defaultFlex: 1 },
  { name: 'interceptionsTouchdown', header: 'interceptionsTouchdown', defaultFlex: 1 },
  { name: 'quarterbackHurries', header: 'quarterbackHurries', defaultFlex: 1 },
  { name: 'sacksTotal', header: 'sacksTotal', defaultFlex: 1 },
  { name: 'sacksYards', header: 'sacksYards', defaultFlex: 1 },
  { name: 'passesDefensed', header: 'passesDefensed', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballdefensivestats/selectAll',{
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

const AmericanFootballDefensiveStats = () => {
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

export default AmericanFootballDefensiveStats;