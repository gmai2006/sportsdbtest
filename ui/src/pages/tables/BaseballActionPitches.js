import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'baseballActionPlayId', header: 'baseballActionPlayId', defaultFlex: 1 },
  { name: 'sequenceNumber', header: 'sequenceNumber', defaultFlex: 1 },
  { name: 'baseballDefensiveGroupId', header: 'baseballDefensiveGroupId', defaultFlex: 1 },
  { name: 'umpireCall', header: 'umpireCall', defaultFlex: 1 },
  { name: 'pitchLocation', header: 'pitchLocation', defaultFlex: 1 },
  { name: 'pitchType', header: 'pitchType', defaultFlex: 1 },
  { name: 'pitchVelocity', header: 'pitchVelocity', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
  { name: 'trajectoryCoordinates', header: 'trajectoryCoordinates', defaultFlex: 1 },
  { name: 'trajectoryFormula', header: 'trajectoryFormula', defaultFlex: 1 },
  { name: 'ballType', header: 'ballType', defaultFlex: 1 },
  { name: 'strikeType', header: 'strikeType', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballactionpitches/selectAll',{
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

const BaseballActionPitches = () => {
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

export default BaseballActionPitches;