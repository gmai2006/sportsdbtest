import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'baseballEventStateId', header: 'baseballEventStateId', defaultFlex: 1 },
  { name: 'sequenceNumber', header: 'sequenceNumber', defaultFlex: 1 },
  { name: 'personType', header: 'personType', defaultFlex: 1 },
  { name: 'personOriginalId', header: 'personOriginalId', defaultFlex: 1 },
  { name: 'personOriginalPositionId', header: 'personOriginalPositionId', defaultFlex: 1 },
  { name: 'personOriginalLineupSlot', header: 'personOriginalLineupSlot', defaultFlex: 1 },
  { name: 'personReplacingId', header: 'personReplacingId', defaultFlex: 1 },
  { name: 'personReplacingPositionId', header: 'personReplacingPositionId', defaultFlex: 1 },
  { name: 'personReplacingLineupSlot', header: 'personReplacingLineupSlot', defaultFlex: 1 },
  { name: 'substitutionReason', header: 'substitutionReason', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballactionsubstitutions/selectAll',{
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

const BaseballActionSubstitutions = () => {
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

export default BaseballActionSubstitutions;