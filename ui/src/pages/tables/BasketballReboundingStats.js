import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'reboundsTotal', header: 'reboundsTotal', defaultFlex: 1 },
  { name: 'reboundsPerGame', header: 'reboundsPerGame', defaultFlex: 1 },
  { name: 'reboundsDefensive', header: 'reboundsDefensive', defaultFlex: 1 },
  { name: 'reboundsOffensive', header: 'reboundsOffensive', defaultFlex: 1 },
  { name: 'teamReboundsTotal', header: 'teamReboundsTotal', defaultFlex: 1 },
  { name: 'teamReboundsPerGame', header: 'teamReboundsPerGame', defaultFlex: 1 },
  { name: 'teamReboundsDefensive', header: 'teamReboundsDefensive', defaultFlex: 1 },
  { name: 'teamReboundsOffensive', header: 'teamReboundsOffensive', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'basketballreboundingstats/selectAll',{
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

const BasketballReboundingStats = () => {
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

export default BasketballReboundingStats;