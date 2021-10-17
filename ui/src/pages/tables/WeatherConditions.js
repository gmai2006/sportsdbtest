import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'eventId', header: 'eventId', defaultFlex: 1 },
  { name: 'temperature', header: 'temperature', defaultFlex: 1 },
  { name: 'temperatureUnits', header: 'temperatureUnits', defaultFlex: 1 },
  { name: 'humidity', header: 'humidity', defaultFlex: 1 },
  { name: 'clouds', header: 'clouds', defaultFlex: 1 },
  { name: 'windDirection', header: 'windDirection', defaultFlex: 1 },
  { name: 'windVelocity', header: 'windVelocity', defaultFlex: 1 },
  { name: 'weatherCode', header: 'weatherCode', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'weatherconditions/selectAll',{
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

const WeatherConditions = () => {
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

export default WeatherConditions;