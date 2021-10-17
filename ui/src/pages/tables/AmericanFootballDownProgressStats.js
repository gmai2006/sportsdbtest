import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'firstDownsTotal', header: 'firstDownsTotal', defaultFlex: 1 },
  { name: 'firstDownsPass', header: 'firstDownsPass', defaultFlex: 1 },
  { name: 'firstDownsRun', header: 'firstDownsRun', defaultFlex: 1 },
  { name: 'firstDownsPenalty', header: 'firstDownsPenalty', defaultFlex: 1 },
  { name: 'conversionsThirdDown', header: 'conversionsThirdDown', defaultFlex: 1 },
  { name: 'conversionsThirdDownAttempts', header: 'conversionsThirdDownAttempts', defaultFlex: 1 },
  { name: 'conversionsThirdDownPercentage', header: 'conversionsThirdDownPercentage', defaultFlex: 1 },
  { name: 'conversionsFourthDown', header: 'conversionsFourthDown', defaultFlex: 1 },
  { name: 'conversionsFourthDownAttempts', header: 'conversionsFourthDownAttempts', defaultFlex: 1 },
  { name: 'conversionsFourthDownPercentage', header: 'conversionsFourthDownPercentage', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballdownprogressstats/selectAll',{
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

const AmericanFootballDownProgressStats = () => {
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

export default AmericanFootballDownProgressStats;