import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'americanFootballEventStateId', header: 'americanFootballEventStateId', defaultFlex: 1 },
  { name: 'playType', header: 'playType', defaultFlex: 1 },
  { name: 'scoreAttemptType', header: 'scoreAttemptType', defaultFlex: 1 },
  { name: 'driveResult', header: 'driveResult', defaultFlex: 1 },
  { name: 'points', header: 'points', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballactionplays/selectAll',{
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

const AmericanFootballActionPlays = () => {
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

export default AmericanFootballActionPlays;