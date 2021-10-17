import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'touchdownsTotal', header: 'touchdownsTotal', defaultFlex: 1 },
  { name: 'touchdownsPassing', header: 'touchdownsPassing', defaultFlex: 1 },
  { name: 'touchdownsRushing', header: 'touchdownsRushing', defaultFlex: 1 },
  { name: 'touchdownsSpecialTeams', header: 'touchdownsSpecialTeams', defaultFlex: 1 },
  { name: 'touchdownsDefensive', header: 'touchdownsDefensive', defaultFlex: 1 },
  { name: 'extraPointsAttempts', header: 'extraPointsAttempts', defaultFlex: 1 },
  { name: 'extraPointsMade', header: 'extraPointsMade', defaultFlex: 1 },
  { name: 'extraPointsMissed', header: 'extraPointsMissed', defaultFlex: 1 },
  { name: 'extraPointsBlocked', header: 'extraPointsBlocked', defaultFlex: 1 },
  { name: 'fieldGoalAttempts', header: 'fieldGoalAttempts', defaultFlex: 1 },
  { name: 'fieldGoalsMade', header: 'fieldGoalsMade', defaultFlex: 1 },
  { name: 'fieldGoalsMissed', header: 'fieldGoalsMissed', defaultFlex: 1 },
  { name: 'fieldGoalsBlocked', header: 'fieldGoalsBlocked', defaultFlex: 1 },
  { name: 'safetiesAgainst', header: 'safetiesAgainst', defaultFlex: 1 },
  { name: 'twoPointConversionsAttempts', header: 'twoPointConversionsAttempts', defaultFlex: 1 },
  { name: 'twoPointConversionsMade', header: 'twoPointConversionsMade', defaultFlex: 1 },
  { name: 'touchbacksTotal', header: 'touchbacksTotal', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballscoringstats/selectAll',{
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

const AmericanFootballScoringStats = () => {
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

export default AmericanFootballScoringStats;