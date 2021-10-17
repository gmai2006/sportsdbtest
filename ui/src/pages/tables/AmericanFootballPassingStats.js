import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'passesAttempts', header: 'passesAttempts', defaultFlex: 1 },
  { name: 'passesCompletions', header: 'passesCompletions', defaultFlex: 1 },
  { name: 'passesPercentage', header: 'passesPercentage', defaultFlex: 1 },
  { name: 'passesYardsGross', header: 'passesYardsGross', defaultFlex: 1 },
  { name: 'passesYardsNet', header: 'passesYardsNet', defaultFlex: 1 },
  { name: 'passesYardsLost', header: 'passesYardsLost', defaultFlex: 1 },
  { name: 'passesTouchdowns', header: 'passesTouchdowns', defaultFlex: 1 },
  { name: 'passesTouchdownsPercentage', header: 'passesTouchdownsPercentage', defaultFlex: 1 },
  { name: 'passesInterceptions', header: 'passesInterceptions', defaultFlex: 1 },
  { name: 'passesInterceptionsPercentage', header: 'passesInterceptionsPercentage', defaultFlex: 1 },
  { name: 'passesLongest', header: 'passesLongest', defaultFlex: 1 },
  { name: 'passesAverageYardsPer', header: 'passesAverageYardsPer', defaultFlex: 1 },
  { name: 'passerRating', header: 'passerRating', defaultFlex: 1 },
  { name: 'receptionsTotal', header: 'receptionsTotal', defaultFlex: 1 },
  { name: 'receptionsYards', header: 'receptionsYards', defaultFlex: 1 },
  { name: 'receptionsTouchdowns', header: 'receptionsTouchdowns', defaultFlex: 1 },
  { name: 'receptionsFirstDown', header: 'receptionsFirstDown', defaultFlex: 1 },
  { name: 'receptionsLongest', header: 'receptionsLongest', defaultFlex: 1 },
  { name: 'receptionsAverageYardsPer', header: 'receptionsAverageYardsPer', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballpassingstats/selectAll',{
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

const AmericanFootballPassingStats = () => {
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

export default AmericanFootballPassingStats;