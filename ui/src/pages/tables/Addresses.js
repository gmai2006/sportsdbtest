import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'locationId', header: 'locationId', defaultFlex: 1 },
  { name: 'language', header: 'language', defaultFlex: 1 },
  { name: 'suite', header: 'suite', defaultFlex: 1 },
  { name: 'floor', header: 'floor', defaultFlex: 1 },
  { name: 'building', header: 'building', defaultFlex: 1 },
  { name: 'streetNumber', header: 'streetNumber', defaultFlex: 1 },
  { name: 'streetPrefix', header: 'streetPrefix', defaultFlex: 1 },
  { name: 'street', header: 'street', defaultFlex: 1 },
  { name: 'streetSuffix', header: 'streetSuffix', defaultFlex: 1 },
  { name: 'neighborhood', header: 'neighborhood', defaultFlex: 1 },
  { name: 'district', header: 'district', defaultFlex: 1 },
  { name: 'locality', header: 'locality', defaultFlex: 1 },
  { name: 'county', header: 'county', defaultFlex: 1 },
  { name: 'region', header: 'region', defaultFlex: 1 },
  { name: 'postalCode', header: 'postalCode', defaultFlex: 1 },
  { name: 'country', header: 'country', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'addresses/selectAll',{
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

const Addresses = () => {
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

export default Addresses;