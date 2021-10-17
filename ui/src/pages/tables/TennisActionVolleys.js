import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'sequenceNumber', header: 'sequenceNumber', defaultFlex: 1 },
  { name: 'tennisActionPointsId', header: 'tennisActionPointsId', defaultFlex: 1 },
  { name: 'landingLocation', header: 'landingLocation', defaultFlex: 1 },
  { name: 'swingType', header: 'swingType', defaultFlex: 1 },
  { name: 'result', header: 'result', defaultFlex: 1 },
  { name: 'spinType', header: 'spinType', defaultFlex: 1 },
  { name: 'trajectoryDetails', header: 'trajectoryDetails', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'tennisactionvolleys/selectAll',{
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

const TennisActionVolleys = () => {
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

export default TennisActionVolleys;