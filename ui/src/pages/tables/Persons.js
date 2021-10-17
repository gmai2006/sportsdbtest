import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'personKey', header: 'personKey', defaultFlex: 1 },
  { name: 'publisherId', header: 'publisherId', defaultFlex: 1 },
  { name: 'gender', header: 'gender', defaultFlex: 1 },
  { name: 'birthDate', header: 'birthDate', defaultFlex: 1 },
  { name: 'deathDate', header: 'deathDate', defaultFlex: 1 },
  { name: 'birthLocationId', header: 'birthLocationId', defaultFlex: 1 },
  { name: 'hometownLocationId', header: 'hometownLocationId', defaultFlex: 1 },
  { name: 'residenceLocationId', header: 'residenceLocationId', defaultFlex: 1 },
  { name: 'deathLocationId', header: 'deathLocationId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'persons/selectAll',{
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

const Persons = () => {
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

export default Persons;