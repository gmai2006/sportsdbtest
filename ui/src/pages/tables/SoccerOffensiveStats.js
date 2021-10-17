import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'goalsGameWinning', header: 'goalsGameWinning', defaultFlex: 1 },
  { name: 'goalsGameTying', header: 'goalsGameTying', defaultFlex: 1 },
  { name: 'goalsOvertime', header: 'goalsOvertime', defaultFlex: 1 },
  { name: 'goalsShootout', header: 'goalsShootout', defaultFlex: 1 },
  { name: 'goalsTotal', header: 'goalsTotal', defaultFlex: 1 },
  { name: 'assistsGameWinning', header: 'assistsGameWinning', defaultFlex: 1 },
  { name: 'assistsGameTying', header: 'assistsGameTying', defaultFlex: 1 },
  { name: 'assistsOvertime', header: 'assistsOvertime', defaultFlex: 1 },
  { name: 'assistsTotal', header: 'assistsTotal', defaultFlex: 1 },
  { name: 'points', header: 'points', defaultFlex: 1 },
  { name: 'shotsTotal', header: 'shotsTotal', defaultFlex: 1 },
  { name: 'shotsOnGoalTotal', header: 'shotsOnGoalTotal', defaultFlex: 1 },
  { name: 'shotsHitFrame', header: 'shotsHitFrame', defaultFlex: 1 },
  { name: 'shotsPenaltyShotTaken', header: 'shotsPenaltyShotTaken', defaultFlex: 1 },
  { name: 'shotsPenaltyShotScored', header: 'shotsPenaltyShotScored', defaultFlex: 1 },
  { name: 'shotsPenaltyShotMissed', header: 'shotsPenaltyShotMissed', defaultFlex: 1 },
  { name: 'shotsPenaltyShotPercentage', header: 'shotsPenaltyShotPercentage', defaultFlex: 1 },
  { name: 'shotsShootoutTaken', header: 'shotsShootoutTaken', defaultFlex: 1 },
  { name: 'shotsShootoutScored', header: 'shotsShootoutScored', defaultFlex: 1 },
  { name: 'shotsShootoutMissed', header: 'shotsShootoutMissed', defaultFlex: 1 },
  { name: 'shotsShootoutPercentage', header: 'shotsShootoutPercentage', defaultFlex: 1 },
  { name: 'giveaways', header: 'giveaways', defaultFlex: 1 },
  { name: 'offsides', header: 'offsides', defaultFlex: 1 },
  { name: 'cornerKicks', header: 'cornerKicks', defaultFlex: 1 },
  { name: 'hatTricks', header: 'hatTricks', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'socceroffensivestats/selectAll',{
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

const SoccerOffensiveStats = () => {
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

export default SoccerOffensiveStats;