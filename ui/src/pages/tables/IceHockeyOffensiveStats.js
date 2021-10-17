import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'goalsGameWinning', header: 'goalsGameWinning', defaultFlex: 1 },
  { name: 'goalsGameTying', header: 'goalsGameTying', defaultFlex: 1 },
  { name: 'goalsPowerPlay', header: 'goalsPowerPlay', defaultFlex: 1 },
  { name: 'goalsShortHanded', header: 'goalsShortHanded', defaultFlex: 1 },
  { name: 'goalsEvenStrength', header: 'goalsEvenStrength', defaultFlex: 1 },
  { name: 'goalsEmptyNet', header: 'goalsEmptyNet', defaultFlex: 1 },
  { name: 'goalsOvertime', header: 'goalsOvertime', defaultFlex: 1 },
  { name: 'goalsShootout', header: 'goalsShootout', defaultFlex: 1 },
  { name: 'goalsPenaltyShot', header: 'goalsPenaltyShot', defaultFlex: 1 },
  { name: 'assists', header: 'assists', defaultFlex: 1 },
  { name: 'points', header: 'points', defaultFlex: 1 },
  { name: 'powerPlayAmount', header: 'powerPlayAmount', defaultFlex: 1 },
  { name: 'powerPlayPercentage', header: 'powerPlayPercentage', defaultFlex: 1 },
  { name: 'shotsPenaltyShotTaken', header: 'shotsPenaltyShotTaken', defaultFlex: 1 },
  { name: 'shotsPenaltyShotMissed', header: 'shotsPenaltyShotMissed', defaultFlex: 1 },
  { name: 'shotsPenaltyShotPercentage', header: 'shotsPenaltyShotPercentage', defaultFlex: 1 },
  { name: 'giveaways', header: 'giveaways', defaultFlex: 1 },
  { name: 'minutesPowerPlay', header: 'minutesPowerPlay', defaultFlex: 1 },
  { name: 'faceoffWins', header: 'faceoffWins', defaultFlex: 1 },
  { name: 'faceoffLosses', header: 'faceoffLosses', defaultFlex: 1 },
  { name: 'faceoffWinPercentage', header: 'faceoffWinPercentage', defaultFlex: 1 },
  { name: 'scoringChances', header: 'scoringChances', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'icehockeyoffensivestats/selectAll',{
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

const IceHockeyOffensiveStats = () => {
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

export default IceHockeyOffensiveStats;