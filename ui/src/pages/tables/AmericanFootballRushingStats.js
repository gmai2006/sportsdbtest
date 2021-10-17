import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'rushesAttempts', header: 'rushesAttempts', defaultFlex: 1 },
  { name: 'rushesYards', header: 'rushesYards', defaultFlex: 1 },
  { name: 'rushesTouchdowns', header: 'rushesTouchdowns', defaultFlex: 1 },
  { name: 'rushingAverageYardsPer', header: 'rushingAverageYardsPer', defaultFlex: 1 },
  { name: 'rushesFirstDown', header: 'rushesFirstDown', defaultFlex: 1 },
  { name: 'rushesLongest', header: 'rushesLongest', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballrushingstats/selectAll',{
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

const AmericanFootballRushingStats = () => {
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

export default AmericanFootballRushingStats;