import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'affiliationId', header: 'affiliationId', defaultFlex: 1 },
  { name: 'standingType', header: 'standingType', defaultFlex: 1 },
  { name: 'subSeasonId', header: 'subSeasonId', defaultFlex: 1 },
  { name: 'lastUpdated', header: 'lastUpdated', defaultFlex: 1 },
  { name: 'durationScope', header: 'durationScope', defaultFlex: 1 },
  { name: 'competitionScope', header: 'competitionScope', defaultFlex: 1 },
  { name: 'competitionScopeId', header: 'competitionScopeId', defaultFlex: 1 },
  { name: 'alignmentScope', header: 'alignmentScope', defaultFlex: 1 },
  { name: 'siteScope', header: 'siteScope', defaultFlex: 1 },
  { name: 'scopingLabel', header: 'scopingLabel', defaultFlex: 1 },
  { name: 'publisherId', header: 'publisherId', defaultFlex: 1 },
  { name: 'source', header: 'source', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'standings/selectAll',{
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

const Standings = () => {
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

export default Standings;