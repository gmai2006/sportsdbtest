import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'runsAllowed', header: 'runsAllowed', defaultFlex: 1 },
  { name: 'singlesAllowed', header: 'singlesAllowed', defaultFlex: 1 },
  { name: 'doublesAllowed', header: 'doublesAllowed', defaultFlex: 1 },
  { name: 'triplesAllowed', header: 'triplesAllowed', defaultFlex: 1 },
  { name: 'homeRunsAllowed', header: 'homeRunsAllowed', defaultFlex: 1 },
  { name: 'inningsPitched', header: 'inningsPitched', defaultFlex: 1 },
  { name: 'hits', header: 'hits', defaultFlex: 1 },
  { name: 'earnedRuns', header: 'earnedRuns', defaultFlex: 1 },
  { name: 'unearnedRuns', header: 'unearnedRuns', defaultFlex: 1 },
  { name: 'basesOnBalls', header: 'basesOnBalls', defaultFlex: 1 },
  { name: 'basesOnBallsIntentional', header: 'basesOnBallsIntentional', defaultFlex: 1 },
  { name: 'strikeouts', header: 'strikeouts', defaultFlex: 1 },
  { name: 'strikeoutToBbRatio', header: 'strikeoutToBbRatio', defaultFlex: 1 },
  { name: 'numberOfPitches', header: 'numberOfPitches', defaultFlex: 1 },
  { name: 'era', header: 'era', defaultFlex: 1 },
  { name: 'inheritedRunnersScored', header: 'inheritedRunnersScored', defaultFlex: 1 },
  { name: 'pickOffs', header: 'pickOffs', defaultFlex: 1 },
  { name: 'errorsHitWithPitch', header: 'errorsHitWithPitch', defaultFlex: 1 },
  { name: 'errorsWildPitch', header: 'errorsWildPitch', defaultFlex: 1 },
  { name: 'balks', header: 'balks', defaultFlex: 1 },
  { name: 'wins', header: 'wins', defaultFlex: 1 },
  { name: 'losses', header: 'losses', defaultFlex: 1 },
  { name: 'saves', header: 'saves', defaultFlex: 1 },
  { name: 'shutouts', header: 'shutouts', defaultFlex: 1 },
  { name: 'gamesComplete', header: 'gamesComplete', defaultFlex: 1 },
  { name: 'gamesFinished', header: 'gamesFinished', defaultFlex: 1 },
  { name: 'winningPercentage', header: 'winningPercentage', defaultFlex: 1 },
  { name: 'eventCredit', header: 'eventCredit', defaultFlex: 1 },
  { name: 'saveCredit', header: 'saveCredit', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballpitchingstats/selectAll',{
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

const BaseballPitchingStats = () => {
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

export default BaseballPitchingStats;