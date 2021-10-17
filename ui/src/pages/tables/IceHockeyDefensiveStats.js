import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'shotsPowerPlayAllowed', header: 'shotsPowerPlayAllowed', defaultFlex: 1 },
  { name: 'shotsPenaltyShotAllowed', header: 'shotsPenaltyShotAllowed', defaultFlex: 1 },
  { name: 'goalsPowerPlayAllowed', header: 'goalsPowerPlayAllowed', defaultFlex: 1 },
  { name: 'goalsPenaltyShotAllowed', header: 'goalsPenaltyShotAllowed', defaultFlex: 1 },
  { name: 'goalsAgainstAverage', header: 'goalsAgainstAverage', defaultFlex: 1 },
  { name: 'saves', header: 'saves', defaultFlex: 1 },
  { name: 'savePercentage', header: 'savePercentage', defaultFlex: 1 },
  { name: 'penaltyKillingAmount', header: 'penaltyKillingAmount', defaultFlex: 1 },
  { name: 'penaltyKillingPercentage', header: 'penaltyKillingPercentage', defaultFlex: 1 },
  { name: 'shotsBlocked', header: 'shotsBlocked', defaultFlex: 1 },
  { name: 'takeaways', header: 'takeaways', defaultFlex: 1 },
  { name: 'shutouts', header: 'shutouts', defaultFlex: 1 },
  { name: 'minutesPenaltyKilling', header: 'minutesPenaltyKilling', defaultFlex: 1 },
  { name: 'hits', header: 'hits', defaultFlex: 1 },
  { name: 'goalsEmptyNetAllowed', header: 'goalsEmptyNetAllowed', defaultFlex: 1 },
  { name: 'goalsShortHandedAllowed', header: 'goalsShortHandedAllowed', defaultFlex: 1 },
  { name: 'goalsShootoutAllowed', header: 'goalsShootoutAllowed', defaultFlex: 1 },
  { name: 'shotsShootoutAllowed', header: 'shotsShootoutAllowed', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'icehockeydefensivestats/selectAll',{
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

const IceHockeyDefensiveStats = () => {
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

export default IceHockeyDefensiveStats;