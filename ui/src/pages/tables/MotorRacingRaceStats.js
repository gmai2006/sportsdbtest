import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'timeBehindLeader', header: 'timeBehindLeader', defaultFlex: 1 },
  { name: 'lapsBehindLeader', header: 'lapsBehindLeader', defaultFlex: 1 },
  { name: 'timeAheadFollower', header: 'timeAheadFollower', defaultFlex: 1 },
  { name: 'lapsAheadFollower', header: 'lapsAheadFollower', defaultFlex: 1 },
  { name: 'time', header: 'time', defaultFlex: 1 },
  { name: 'points', header: 'points', defaultFlex: 1 },
  { name: 'pointsRookie', header: 'pointsRookie', defaultFlex: 1 },
  { name: 'bonus', header: 'bonus', defaultFlex: 1 },
  { name: 'lapsCompleted', header: 'lapsCompleted', defaultFlex: 1 },
  { name: 'lapsLeadingTotal', header: 'lapsLeadingTotal', defaultFlex: 1 },
  { name: 'distanceLeading', header: 'distanceLeading', defaultFlex: 1 },
  { name: 'distanceCompleted', header: 'distanceCompleted', defaultFlex: 1 },
  { name: 'distanceUnits', header: 'distanceUnits', defaultFlex: 1 },
  { name: 'speedAverage', header: 'speedAverage', defaultFlex: 1 },
  { name: 'speedUnits', header: 'speedUnits', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'finishesTop5', header: 'finishesTop5', defaultFlex: 1 },
  { name: 'finishesTop10', header: 'finishesTop10', defaultFlex: 1 },
  { name: 'starts', header: 'starts', defaultFlex: 1 },
  { name: 'finishes', header: 'finishes', defaultFlex: 1 },
  { name: 'nonFinishes', header: 'nonFinishes', defaultFlex: 1 },
  { name: 'wins', header: 'wins', defaultFlex: 1 },
  { name: 'racesLeading', header: 'racesLeading', defaultFlex: 1 },
  { name: 'money', header: 'money', defaultFlex: 1 },
  { name: 'moneyUnits', header: 'moneyUnits', defaultFlex: 1 },
  { name: 'leadsTotal', header: 'leadsTotal', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'motorracingracestats/selectAll',{
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

const MotorRacingRaceStats = () => {
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

export default MotorRacingRaceStats;