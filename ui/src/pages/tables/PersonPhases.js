import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'personId', header: 'personId', defaultFlex: 1 },
  { name: 'membershipType', header: 'membershipType', defaultFlex: 1 },
  { name: 'membershipId', header: 'membershipId', defaultFlex: 1 },
  { name: 'roleId', header: 'roleId', defaultFlex: 1 },
  { name: 'roleStatus', header: 'roleStatus', defaultFlex: 1 },
  { name: 'phaseStatus', header: 'phaseStatus', defaultFlex: 1 },
  { name: 'uniformNumber', header: 'uniformNumber', defaultFlex: 1 },
  { name: 'regularPositionId', header: 'regularPositionId', defaultFlex: 1 },
  { name: 'regularPositionDepth', header: 'regularPositionDepth', defaultFlex: 1 },
  { name: 'height', header: 'height', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'startDateTime', header: 'startDateTime', defaultFlex: 1 },
  { name: 'startSeasonId', header: 'startSeasonId', defaultFlex: 1 },
  { name: 'endDateTime', header: 'endDateTime', defaultFlex: 1 },
  { name: 'endSeasonId', header: 'endSeasonId', defaultFlex: 1 },
  { name: 'entryReason', header: 'entryReason', defaultFlex: 1 },
  { name: 'exitReason', header: 'exitReason', defaultFlex: 1 },
  { name: 'selectionLevel', header: 'selectionLevel', defaultFlex: 1 },
  { name: 'selectionSublevel', header: 'selectionSublevel', defaultFlex: 1 },
  { name: 'selectionOverall', header: 'selectionOverall', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'personphases/selectAll',{
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

const PersonPhases = () => {
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

export default PersonPhases;