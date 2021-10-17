import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'baseballEventStateId', header: 'baseballEventStateId', defaultFlex: 1 },
  { name: 'playType', header: 'playType', defaultFlex: 1 },
  { name: 'notation', header: 'notation', defaultFlex: 1 },
  { name: 'notationYaml', header: 'notationYaml', defaultFlex: 1 },
  { name: 'baseballDefensiveGroupId', header: 'baseballDefensiveGroupId', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
  { name: 'runnerOnFirstAdvance', header: 'runnerOnFirstAdvance', defaultFlex: 1 },
  { name: 'runnerOnSecondAdvance', header: 'runnerOnSecondAdvance', defaultFlex: 1 },
  { name: 'runnerOnThirdAdvance', header: 'runnerOnThirdAdvance', defaultFlex: 1 },
  { name: 'outsRecorded', header: 'outsRecorded', defaultFlex: 1 },
  { name: 'rbi', header: 'rbi', defaultFlex: 1 },
  { name: 'runsScored', header: 'runsScored', defaultFlex: 1 },
  { name: 'earnedRunsScored', header: 'earnedRunsScored', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballactionplays/selectAll',{
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

const BaseballActionPlays = () => {
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

export default BaseballActionPlays;