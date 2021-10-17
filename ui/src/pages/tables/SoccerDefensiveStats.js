import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'shotsPenaltyShotAllowed', header: 'shotsPenaltyShotAllowed', defaultFlex: 1 },
  { name: 'goalsPenaltyShotAllowed', header: 'goalsPenaltyShotAllowed', defaultFlex: 1 },
  { name: 'goalsAgainstAverage', header: 'goalsAgainstAverage', defaultFlex: 1 },
  { name: 'goalsAgainstTotal', header: 'goalsAgainstTotal', defaultFlex: 1 },
  { name: 'saves', header: 'saves', defaultFlex: 1 },
  { name: 'savePercentage', header: 'savePercentage', defaultFlex: 1 },
  { name: 'catchesPunches', header: 'catchesPunches', defaultFlex: 1 },
  { name: 'shotsOnGoalTotal', header: 'shotsOnGoalTotal', defaultFlex: 1 },
  { name: 'shotsShootoutTotal', header: 'shotsShootoutTotal', defaultFlex: 1 },
  { name: 'shotsShootoutAllowed', header: 'shotsShootoutAllowed', defaultFlex: 1 },
  { name: 'shotsBlocked', header: 'shotsBlocked', defaultFlex: 1 },
  { name: 'shutouts', header: 'shutouts', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'soccerdefensivestats/selectAll',{
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

const SoccerDefensiveStats = () => {
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

export default SoccerDefensiveStats;