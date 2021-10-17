import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'foulsSuffered', header: 'foulsSuffered', defaultFlex: 1 },
  { name: 'foulsCommited', header: 'foulsCommited', defaultFlex: 1 },
  { name: 'cautionsTotal', header: 'cautionsTotal', defaultFlex: 1 },
  { name: 'cautionsPending', header: 'cautionsPending', defaultFlex: 1 },
  { name: 'cautionPointsTotal', header: 'cautionPointsTotal', defaultFlex: 1 },
  { name: 'cautionPointsPending', header: 'cautionPointsPending', defaultFlex: 1 },
  { name: 'ejectionsTotal', header: 'ejectionsTotal', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'soccerfoulstats/selectAll',{
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

const SoccerFoulStats = () => {
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

export default SoccerFoulStats;