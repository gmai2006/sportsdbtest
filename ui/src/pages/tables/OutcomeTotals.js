import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'standingSubgroupId', header: 'standingSubgroupId', defaultFlex: 1 },
  { name: 'outcomeHolderType', header: 'outcomeHolderType', defaultFlex: 1 },
  { name: 'outcomeHolderId', header: 'outcomeHolderId', defaultFlex: 1 },
  { name: 'rank', header: 'rank', defaultFlex: 1 },
  { name: 'wins', header: 'wins', defaultFlex: 1 },
  { name: 'losses', header: 'losses', defaultFlex: 1 },
  { name: 'ties', header: 'ties', defaultFlex: 1 },
  { name: 'undecideds', header: 'undecideds', defaultFlex: 1 },
  { name: 'winningPercentage', header: 'winningPercentage', defaultFlex: 1 },
  { name: 'pointsScoredFor', header: 'pointsScoredFor', defaultFlex: 1 },
  { name: 'pointsScoredAgainst', header: 'pointsScoredAgainst', defaultFlex: 1 },
  { name: 'pointsDifference', header: 'pointsDifference', defaultFlex: 1 },
  { name: 'standingPoints', header: 'standingPoints', defaultFlex: 1 },
  { name: 'streakType', header: 'streakType', defaultFlex: 1 },
  { name: 'streakDuration', header: 'streakDuration', defaultFlex: 1 },
  { name: 'streakTotal', header: 'streakTotal', defaultFlex: 1 },
  { name: 'streakStart', header: 'streakStart', defaultFlex: 1 },
  { name: 'streakEnd', header: 'streakEnd', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'outcometotals/selectAll',{
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

const OutcomeTotals = () => {
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

export default OutcomeTotals;