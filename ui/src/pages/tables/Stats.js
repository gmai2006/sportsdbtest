import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'statRepositoryType', header: 'statRepositoryType', defaultFlex: 1 },
  { name: 'statRepositoryId', header: 'statRepositoryId', defaultFlex: 1 },
  { name: 'statHolderType', header: 'statHolderType', defaultFlex: 1 },
  { name: 'statHolderId', header: 'statHolderId', defaultFlex: 1 },
  { name: 'statCoverageType', header: 'statCoverageType', defaultFlex: 1 },
  { name: 'statCoverageId', header: 'statCoverageId', defaultFlex: 1 },
  { name: 'context', header: 'context', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'stats/selectAll',{
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

const Stats = () => {
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

export default Stats;