import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'baseballActionPitchId', header: 'baseballActionPitchId', defaultFlex: 1 },
  { name: 'location', header: 'location', defaultFlex: 1 },
  { name: 'strength', header: 'strength', defaultFlex: 1 },
  { name: 'velocity', header: 'velocity', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
  { name: 'trajectoryCoordinates', header: 'trajectoryCoordinates', defaultFlex: 1 },
  { name: 'trajectoryFormula', header: 'trajectoryFormula', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballactioncontactdetails/selectAll',{
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

const BaseballActionContactDetails = () => {
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

export default BaseballActionContactDetails;