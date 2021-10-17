import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'eventId', header: 'eventId', defaultFlex: 1 },
  { name: 'currentState', header: 'currentState', defaultFlex: 1 },
  { name: 'sequenceNumber', header: 'sequenceNumber', defaultFlex: 1 },
  { name: 'atBatNumber', header: 'atBatNumber', defaultFlex: 1 },
  { name: 'inningValue', header: 'inningValue', defaultFlex: 1 },
  { name: 'inningHalf', header: 'inningHalf', defaultFlex: 1 },
  { name: 'outs', header: 'outs', defaultFlex: 1 },
  { name: 'balls', header: 'balls', defaultFlex: 1 },
  { name: 'strikes', header: 'strikes', defaultFlex: 1 },
  { name: 'runnerOnFirstId', header: 'runnerOnFirstId', defaultFlex: 1 },
  { name: 'runnerOnSecondId', header: 'runnerOnSecondId', defaultFlex: 1 },
  { name: 'runnerOnThirdId', header: 'runnerOnThirdId', defaultFlex: 1 },
  { name: 'runnerOnFirst', header: 'runnerOnFirst', defaultFlex: 1 },
  { name: 'runnerOnSecond', header: 'runnerOnSecond', defaultFlex: 1 },
  { name: 'runnerOnThird', header: 'runnerOnThird', defaultFlex: 1 },
  { name: 'runsThisInningHalf', header: 'runsThisInningHalf', defaultFlex: 1 },
  { name: 'pitcherId', header: 'pitcherId', defaultFlex: 1 },
  { name: 'batterId', header: 'batterId', defaultFlex: 1 },
  { name: 'batterSide', header: 'batterSide', defaultFlex: 1 },
  { name: 'context', header: 'context', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'baseballeventstates/selectAll',{
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

const BaseballEventStates = () => {
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

export default BaseballEventStates;