import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'grid', header: 'grid', defaultFlex: 1 },
  { name: 'polePosition', header: 'polePosition', defaultFlex: 1 },
  { name: 'poleWins', header: 'poleWins', defaultFlex: 1 },
  { name: 'qualifyingSpeed', header: 'qualifyingSpeed', defaultFlex: 1 },
  { name: 'qualifyingSpeedUnits', header: 'qualifyingSpeedUnits', defaultFlex: 1 },
  { name: 'qualifyingTime', header: 'qualifyingTime', defaultFlex: 1 },
  { name: 'qualifyingPosition', header: 'qualifyingPosition', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'motorracingqualifyingstats/selectAll',{
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

const MotorRacingQualifyingStats = () => {
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

export default MotorRacingQualifyingStats;