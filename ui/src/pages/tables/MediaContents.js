import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'mediaId', header: 'mediaId', defaultFlex: 1 },
  { name: 'object', header: 'object', defaultFlex: 1 },
  { name: 'format', header: 'format', defaultFlex: 1 },
  { name: 'mimeType', header: 'mimeType', defaultFlex: 1 },
  { name: 'height', header: 'height', defaultFlex: 1 },
  { name: 'width', header: 'width', defaultFlex: 1 },
  { name: 'duration', header: 'duration', defaultFlex: 1 },
  { name: 'fileSize', header: 'fileSize', defaultFlex: 1 },
  { name: 'resolution', header: 'resolution', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'mediacontents/selectAll',{
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

const MediaContents = () => {
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

export default MediaContents;