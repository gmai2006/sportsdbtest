import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'americanFootballActionPlayId', header: 'americanFootballActionPlayId', defaultFlex: 1 },
  { name: 'personId', header: 'personId', defaultFlex: 1 },
  { name: 'participantRole', header: 'participantRole', defaultFlex: 1 },
  { name: 'scoreType', header: 'scoreType', defaultFlex: 1 },
  { name: 'fieldLine', header: 'fieldLine', defaultFlex: 1 },
  { name: 'yardage', header: 'yardage', defaultFlex: 1 },
  { name: 'scoreCredit', header: 'scoreCredit', defaultFlex: 1 },
  { name: 'yardsGained', header: 'yardsGained', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballactionparticipants/selectAll',{
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

const AmericanFootballActionParticipants = () => {
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

export default AmericanFootballActionParticipants;