import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'personId', header: 'personId', defaultFlex: 1 },
  { name: 'injuryStatus', header: 'injuryStatus', defaultFlex: 1 },
  { name: 'injuryType', header: 'injuryType', defaultFlex: 1 },
  { name: 'injuryComment', header: 'injuryComment', defaultFlex: 1 },
  { name: 'disabledList', header: 'disabledList', defaultFlex: 1 },
  { name: 'startDateTime', header: 'startDateTime', defaultFlex: 1 },
  { name: 'endDateTime', header: 'endDateTime', defaultFlex: 1 },
  { name: 'seasonId', header: 'seasonId', defaultFlex: 1 },
  { name: 'phaseType', header: 'phaseType', defaultFlex: 1 },
  { name: 'injurySide', header: 'injurySide', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'injuryphases/selectAll',{
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

const InjuryPhases = () => {
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

export default InjuryPhases;