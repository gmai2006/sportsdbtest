import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'fumblesCommitted', header: 'fumblesCommitted', defaultFlex: 1 },
  { name: 'fumblesForced', header: 'fumblesForced', defaultFlex: 1 },
  { name: 'fumblesRecovered', header: 'fumblesRecovered', defaultFlex: 1 },
  { name: 'fumblesLost', header: 'fumblesLost', defaultFlex: 1 },
  { name: 'fumblesYardsGained', header: 'fumblesYardsGained', defaultFlex: 1 },
  { name: 'fumblesOwnCommitted', header: 'fumblesOwnCommitted', defaultFlex: 1 },
  { name: 'fumblesOwnRecovered', header: 'fumblesOwnRecovered', defaultFlex: 1 },
  { name: 'fumblesOwnLost', header: 'fumblesOwnLost', defaultFlex: 1 },
  { name: 'fumblesOwnYardsGained', header: 'fumblesOwnYardsGained', defaultFlex: 1 },
  { name: 'fumblesOpposingCommitted', header: 'fumblesOpposingCommitted', defaultFlex: 1 },
  { name: 'fumblesOpposingRecovered', header: 'fumblesOpposingRecovered', defaultFlex: 1 },
  { name: 'fumblesOpposingLost', header: 'fumblesOpposingLost', defaultFlex: 1 },
  { name: 'fumblesOpposingYardsGained', header: 'fumblesOpposingYardsGained', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballfumblesstats/selectAll',{
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

const AmericanFootballFumblesStats = () => {
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

export default AmericanFootballFumblesStats;