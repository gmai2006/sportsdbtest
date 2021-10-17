import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'language', header: 'language', defaultFlex: 1 },
  { name: 'entityType', header: 'entityType', defaultFlex: 1 },
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'fullName', header: 'fullName', defaultFlex: 1 },
  { name: 'firstName', header: 'firstName', defaultFlex: 1 },
  { name: 'middleName', header: 'middleName', defaultFlex: 1 },
  { name: 'lastName', header: 'lastName', defaultFlex: 1 },
  { name: 'alias', header: 'alias', defaultFlex: 1 },
  { name: 'abbreviation', header: 'abbreviation', defaultFlex: 1 },
  { name: 'shortName', header: 'shortName', defaultFlex: 1 },
  { name: 'prefix', header: 'prefix', defaultFlex: 1 },
  { name: 'suffix', header: 'suffix', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'displaynames/selectAll',{
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

const DisplayNames = () => {
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

export default DisplayNames;