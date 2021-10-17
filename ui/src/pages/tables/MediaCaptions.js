import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'mediaId', header: 'mediaId', defaultFlex: 1 },
  { name: 'captionType', header: 'captionType', defaultFlex: 1 },
  { name: 'caption', header: 'caption', defaultFlex: 1 },
  { name: 'captionAuthorId', header: 'captionAuthorId', defaultFlex: 1 },
  { name: 'language', header: 'language', defaultFlex: 1 },
  { name: 'captionSize', header: 'captionSize', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'mediacaptions/selectAll',{
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

const MediaCaptions = () => {
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

export default MediaCaptions;