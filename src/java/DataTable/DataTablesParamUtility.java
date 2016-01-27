/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTable;

/**
 *
 * @author zhangqian
 */
import javax.servlet.http.HttpServletRequest;

import DataTable.JQueryDataTableParamModel;

public class DataTablesParamUtility {
	
	public static JQueryDataTableParamModel getParam(HttpServletRequest request)
	{
		if(request.getParameter("sEcho")!=null && request.getParameter("sEcho")!= "")
		{
			JQueryDataTableParamModel param = new JQueryDataTableParamModel();
			param.sEcho = request.getParameter("sEcho");
			param.sSearch = request.getParameter("sSearch");
			param.sColumns = request.getParameter("sColumns");
			param.iDisplayStart = Integer.parseInt( request.getParameter("iDisplayStart") );
			param.iDisplayLength = Integer.parseInt( request.getParameter("iDisplayLength") );
			param.iColumns = Integer.parseInt( request.getParameter("iColumns") );
			param.iSortingCols = Integer.parseInt( request.getParameter("iSortingCols") );
			param.iSortColumnIndex = Integer.parseInt(request.getParameter("iSortCol_0"));
			param.sSortDirection = request.getParameter("sSortDir_0");
			return param;
		}else
			return null;
	}
}