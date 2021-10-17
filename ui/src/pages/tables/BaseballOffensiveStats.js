import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'average', header: 'average', defaultFlex: 1 },
  { name: 'runsScored', header: 'runsScored', defaultFlex: 1 },
  { name: 'atBats', header: 'atBats', defaultFlex: 1 },
  { name: 'hits', header: 'hits', defaultFlex: 1 },
  { name: 'rbi', header: 'rbi', defaultFlex: 1 },
  { name: 'totalBases', header: 'totalBases', defaultFlex: 1 },
  { name: 'sluggingPercentage', header: 'sluggingPercentage', defaultFlex: 1 },
  { name: 'basesOnBalls', header: 'basesOnBalls', defaultFlex: 1 },
  { name: 'strikeouts', header: 'strikeouts', defaultFlex: 1 },
  { name: 'leftOnBase', header: 'leftOnBase', defaultFlex: 1 },
  { name: 'leftInScoringPosition', header: 'leftInScoringPosition', defaultFlex: 1 },
  { name: 'singles', header: 'singles', defaultFlex: 1 },
  { name: 'doubles', header: 'doubles', defaultFlex: 1 },
  { name: 'triples', header: 'triples', defaultFlex: 1 },
  { name: 'homeRuns', header: 'homeRuns', defaultFlex: 1 },
  { name: 'grandSlams', header: 'grandSlams', defaultFlex: 1 },
  { name: 'atBatsPerRbi', header: 'atBatsPerRbi', defaultFlex: 1 },
  { name: 'plateAppearancesPerRbi', header: 'plateAppearancesPerRbi', defaultFlex: 1 },
  { name: 'atBatsPerHomeRun', header: 'atBatsPerHomeRun', defaultFlex: 1 },
  { name: 'plateAppearancesPerHomeRun', header: 'plateAppearancesPerHomeRun', defaultFlex: 1 },
  { name: 'sacFlies', header: 'sacFlies', defaultFlex: 1 },
  { name: 'sacBunts', header: 'sacBunts', defaultFlex: 1 },
  { name: 'groundedIntoDoublePlay', header: 'groundedIntoDoublePlay', defaultFlex: 1 },
  { name: 'movedUp', header: 'movedUp', defaultFlex: 1 },
  { name: 'onBasePercentage', header: 'onBasePercentage', defaultFlex: 1 },
  { name: 'stolenBases', header: 'stolenBases', defaultFlex: 1 },
  { name: 'stolenBasesCaught', header: 'stolenBasesCaught', defaultFlex: 1 },
  { name: 'stolenBasesAverage', header: 'stolenBasesAverage', defaultFlex: 1 },
  { name: 'hitByPitch', header: 'hitByPitch', defaultFlex: 1 },
  { name: 'defensiveInterferanceReaches', header: 'defensiveInterferanceReaches', defaultFlex: 1 },
  { name: 'onBasePlusSlugging', header: 'onBasePlusSlugging', defaultFlex: 1 },
  { name: 'plateAppearances', header: 'plateAppearances', defaultFlex: 1 },
  { name: 'hitsExtraBase', header: 'hitsExtraBase', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballoffensivestats/selectAll',{
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

const BaseballOffensiveStats = () => {
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

export default BaseballOffensiveStats;