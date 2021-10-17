import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'subSeasonKey', header: 'subSeasonKey', defaultFlex: 1 },
  { name: 'seasonId', header: 'seasonId', defaultFlex: 1 },
  { name: 'subSeasonType', header: 'subSeasonType', defaultFlex: 1 },
  { name: 'startDateTime', header: 'startDateTime', defaultFlex: 1 },
  { name: 'endDateTime', header: 'endDateTime', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'subseasons/selectAll',{
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

const SubSeasons = () => {
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

export default SubSeasons;