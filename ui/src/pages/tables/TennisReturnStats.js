import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'returnsPlayed', header: 'returnsPlayed', defaultFlex: 1 },
  { name: 'matchesPlayed', header: 'matchesPlayed', defaultFlex: 1 },
  { name: 'firstServiceReturnPointsWon', header: 'firstServiceReturnPointsWon', defaultFlex: 1 },
  { name: 'firstServiceReturnPointsWonPct', header: 'firstServiceReturnPointsWonPct', defaultFlex: 1 },
  { name: 'secondServiceReturnPointsWon', header: 'secondServiceReturnPointsWon', defaultFlex: 1 },
  { name: 'secondServiceReturnPointsWonPct', header: 'secondServiceReturnPointsWonPct', defaultFlex: 1 },
  { name: 'returnGamesPlayed', header: 'returnGamesPlayed', defaultFlex: 1 },
  { name: 'returnGamesWon', header: 'returnGamesWon', defaultFlex: 1 },
  { name: 'returnGamesWonPct', header: 'returnGamesWonPct', defaultFlex: 1 },
  { name: 'breakPointsPlayed', header: 'breakPointsPlayed', defaultFlex: 1 },
  { name: 'breakPointsConverted', header: 'breakPointsConverted', defaultFlex: 1 },
  { name: 'breakPointsConvertedPct', header: 'breakPointsConvertedPct', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'tennisreturnstats/selectAll',{
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

const TennisReturnStats = () => {
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

export default TennisReturnStats;