import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'fieldGoalsMade', header: 'fieldGoalsMade', defaultFlex: 1 },
  { name: 'fieldGoalsAttempted', header: 'fieldGoalsAttempted', defaultFlex: 1 },
  { name: 'fieldGoalsPercentage', header: 'fieldGoalsPercentage', defaultFlex: 1 },
  { name: 'fieldGoalsPerGame', header: 'fieldGoalsPerGame', defaultFlex: 1 },
  { name: 'fieldGoalsAttemptedPerGame', header: 'fieldGoalsAttemptedPerGame', defaultFlex: 1 },
  { name: 'fieldGoalsPercentageAdjusted', header: 'fieldGoalsPercentageAdjusted', defaultFlex: 1 },
  { name: 'threePointersMade', header: 'threePointersMade', defaultFlex: 1 },
  { name: 'threePointersAttempted', header: 'threePointersAttempted', defaultFlex: 1 },
  { name: 'threePointersPercentage', header: 'threePointersPercentage', defaultFlex: 1 },
  { name: 'threePointersPerGame', header: 'threePointersPerGame', defaultFlex: 1 },
  { name: 'threePointersAttemptedPerGame', header: 'threePointersAttemptedPerGame', defaultFlex: 1 },
  { name: 'freeThrowsMade', header: 'freeThrowsMade', defaultFlex: 1 },
  { name: 'freeThrowsAttempted', header: 'freeThrowsAttempted', defaultFlex: 1 },
  { name: 'freeThrowsPercentage', header: 'freeThrowsPercentage', defaultFlex: 1 },
  { name: 'freeThrowsPerGame', header: 'freeThrowsPerGame', defaultFlex: 1 },
  { name: 'freeThrowsAttemptedPerGame', header: 'freeThrowsAttemptedPerGame', defaultFlex: 1 },
  { name: 'pointsScoredTotal', header: 'pointsScoredTotal', defaultFlex: 1 },
  { name: 'pointsScoredPerGame', header: 'pointsScoredPerGame', defaultFlex: 1 },
  { name: 'assistsTotal', header: 'assistsTotal', defaultFlex: 1 },
  { name: 'assistsPerGame', header: 'assistsPerGame', defaultFlex: 1 },
  { name: 'turnoversTotal', header: 'turnoversTotal', defaultFlex: 1 },
  { name: 'turnoversPerGame', header: 'turnoversPerGame', defaultFlex: 1 },
  { name: 'pointsScoredOffTurnovers', header: 'pointsScoredOffTurnovers', defaultFlex: 1 },
  { name: 'pointsScoredInPaint', header: 'pointsScoredInPaint', defaultFlex: 1 },
  { name: 'pointsScoredOnSecondChance', header: 'pointsScoredOnSecondChance', defaultFlex: 1 },
  { name: 'pointsScoredOnFastBreak', header: 'pointsScoredOnFastBreak', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'basketballoffensivestats/selectAll',{
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

const BasketballOffensiveStats = () => {
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

export default BasketballOffensiveStats;