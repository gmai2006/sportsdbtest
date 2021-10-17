import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'servicesPlayed', header: 'servicesPlayed', defaultFlex: 1 },
  { name: 'matchesPlayed', header: 'matchesPlayed', defaultFlex: 1 },
  { name: 'aces', header: 'aces', defaultFlex: 1 },
  { name: 'firstServicesGood', header: 'firstServicesGood', defaultFlex: 1 },
  { name: 'firstServicesGoodPct', header: 'firstServicesGoodPct', defaultFlex: 1 },
  { name: 'firstServicePointsWon', header: 'firstServicePointsWon', defaultFlex: 1 },
  { name: 'firstServicePointsWonPct', header: 'firstServicePointsWonPct', defaultFlex: 1 },
  { name: 'secondServicePointsWon', header: 'secondServicePointsWon', defaultFlex: 1 },
  { name: 'secondServicePointsWonPct', header: 'secondServicePointsWonPct', defaultFlex: 1 },
  { name: 'serviceGamesPlayed', header: 'serviceGamesPlayed', defaultFlex: 1 },
  { name: 'serviceGamesWon', header: 'serviceGamesWon', defaultFlex: 1 },
  { name: 'serviceGamesWonPct', header: 'serviceGamesWonPct', defaultFlex: 1 },
  { name: 'breakPointsPlayed', header: 'breakPointsPlayed', defaultFlex: 1 },
  { name: 'breakPointsSaved', header: 'breakPointsSaved', defaultFlex: 1 },
  { name: 'breakPointsSavedPct', header: 'breakPointsSavedPct', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'tennisservicestats/selectAll',{
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

const TennisServiceStats = () => {
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

export default TennisServiceStats;