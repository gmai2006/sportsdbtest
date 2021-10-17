import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'returnsPuntTotal', header: 'returnsPuntTotal', defaultFlex: 1 },
  { name: 'returnsPuntYards', header: 'returnsPuntYards', defaultFlex: 1 },
  { name: 'returnsPuntAverage', header: 'returnsPuntAverage', defaultFlex: 1 },
  { name: 'returnsPuntLongest', header: 'returnsPuntLongest', defaultFlex: 1 },
  { name: 'returnsPuntTouchdown', header: 'returnsPuntTouchdown', defaultFlex: 1 },
  { name: 'returnsKickoffTotal', header: 'returnsKickoffTotal', defaultFlex: 1 },
  { name: 'returnsKickoffYards', header: 'returnsKickoffYards', defaultFlex: 1 },
  { name: 'returnsKickoffAverage', header: 'returnsKickoffAverage', defaultFlex: 1 },
  { name: 'returnsKickoffLongest', header: 'returnsKickoffLongest', defaultFlex: 1 },
  { name: 'returnsKickoffTouchdown', header: 'returnsKickoffTouchdown', defaultFlex: 1 },
  { name: 'returnsTotal', header: 'returnsTotal', defaultFlex: 1 },
  { name: 'returnsYards', header: 'returnsYards', defaultFlex: 1 },
  { name: 'puntsTotal', header: 'puntsTotal', defaultFlex: 1 },
  { name: 'puntsYardsGross', header: 'puntsYardsGross', defaultFlex: 1 },
  { name: 'puntsYardsNet', header: 'puntsYardsNet', defaultFlex: 1 },
  { name: 'puntsLongest', header: 'puntsLongest', defaultFlex: 1 },
  { name: 'puntsInside20', header: 'puntsInside20', defaultFlex: 1 },
  { name: 'puntsInside20Percentage', header: 'puntsInside20Percentage', defaultFlex: 1 },
  { name: 'puntsAverage', header: 'puntsAverage', defaultFlex: 1 },
  { name: 'puntsBlocked', header: 'puntsBlocked', defaultFlex: 1 },
  { name: 'touchbacksTotal', header: 'touchbacksTotal', defaultFlex: 1 },
  { name: 'touchbacksTotalPercentage', header: 'touchbacksTotalPercentage', defaultFlex: 1 },
  { name: 'touchbacksKickoffs', header: 'touchbacksKickoffs', defaultFlex: 1 },
  { name: 'touchbacksKickoffsPercentage', header: 'touchbacksKickoffsPercentage', defaultFlex: 1 },
  { name: 'touchbacksPunts', header: 'touchbacksPunts', defaultFlex: 1 },
  { name: 'touchbacksPuntsPercentage', header: 'touchbacksPuntsPercentage', defaultFlex: 1 },
  { name: 'touchbacksInterceptions', header: 'touchbacksInterceptions', defaultFlex: 1 },
  { name: 'touchbacksInterceptionsPercentage', header: 'touchbacksInterceptionsPercentage', defaultFlex: 1 },
  { name: 'fairCatches', header: 'fairCatches', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'americanfootballspecialteamsstats/selectAll',{
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

const AmericanFootballSpecialTeamsStats = () => {
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

export default AmericanFootballSpecialTeamsStats;