import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'offensivePlaysYards', header: 'offensivePlaysYards', defaultFlex: 1 },
  { name: 'offensivePlaysNumber', header: 'offensivePlaysNumber', defaultFlex: 1 },
  { name: 'offensivePlaysAverageYardsPer', header: 'offensivePlaysAverageYardsPer', defaultFlex: 1 },
  { name: 'possessionDuration', header: 'possessionDuration', defaultFlex: 1 },
  { name: 'turnoversGiveaway', header: 'turnoversGiveaway', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballoffensivestats/selectAll',{
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

const AmericanFootballOffensiveStats = () => {
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

export default AmericanFootballOffensiveStats;