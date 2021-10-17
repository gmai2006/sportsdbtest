import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'docId', header: 'docId', defaultFlex: 1 },
  { name: 'publisherId', header: 'publisherId', defaultFlex: 1 },
  { name: 'dateTime', header: 'dateTime', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
  { name: 'language', header: 'language', defaultFlex: 1 },
  { name: 'priority', header: 'priority', defaultFlex: 1 },
  { name: 'revisionId', header: 'revisionId', defaultFlex: 1 },
  { name: 'statsCoverage', header: 'statsCoverage', defaultFlex: 1 },
  { name: 'documentFixtureId', header: 'documentFixtureId', defaultFlex: 1 },
  { name: 'sourceId', header: 'sourceId', defaultFlex: 1 },
  { name: 'dbLoadingDateTime', header: 'dbLoadingDateTime', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'documents/selectAll',{
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

const Documents = () => {
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

export default Documents;