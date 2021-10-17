import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'affiliationId', header: 'affiliationId', defaultFlex: 1 },
  { name: 'ancestorAffiliationId', header: 'ancestorAffiliationId', defaultFlex: 1 },
  { name: 'startSeasonId', header: 'startSeasonId', defaultFlex: 1 },
  { name: 'startDateTime', header: 'startDateTime', defaultFlex: 1 },
  { name: 'endSeasonId', header: 'endSeasonId', defaultFlex: 1 },
  { name: 'endDateTime', header: 'endDateTime', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'affiliationphases/selectAll',{
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

const AffiliationPhases = () => {
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

export default AffiliationPhases;