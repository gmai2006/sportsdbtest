import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'bookmakerId', header: 'bookmakerId', defaultFlex: 1 },
  { name: 'eventId', header: 'eventId', defaultFlex: 1 },
  { name: 'dateTime', header: 'dateTime', defaultFlex: 1 },
  { name: 'teamId', header: 'teamId', defaultFlex: 1 },
  { name: 'personId', header: 'personId', defaultFlex: 1 },
  { name: 'rotationKey', header: 'rotationKey', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
  { name: 'vigorish', header: 'vigorish', defaultFlex: 1 },
  { name: 'lineValue', header: 'lineValue', defaultFlex: 1 },
  { name: 'lineValueOpening', header: 'lineValueOpening', defaultFlex: 1 },
  { name: 'prediction', header: 'prediction', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'wageringstraightspreadlines/selectAll',{
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

const WageringStraightSpreadLines = () => {
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

export default WageringStraightSpreadLines;