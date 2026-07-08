
// Description: Java 25 protlic DbIO interface for TimeCol.

/*
 *	server.markhome.mcf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cfbam.cfbamprot;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfbam.cfbampub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbamprotobj.*;

/*
 *	CFBamProtTimeColTable protlic database interface for TimeCol has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFBamProtTimeColTable
extends ICFBamProtTimeDefTable,
	ICFBamPubTimeColTable
{
	public static final String TABLE_NAME = "TimeCol";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtTimeCol protcreateTimeCol( ICFSecProtAuthorization Authorization,
		ICFBamProtTimeCol rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtTimeCol protcreateTimeCol( ICFSecProtAuthorization Authorization,
		ICFBamPubTimeCol rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtTimeCol protupdateTimeCol( ICFSecProtAuthorization Authorization,
		ICFBamProtTimeCol rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtTimeCol protupdateTimeCol( ICFSecProtAuthorization Authorization,
		ICFBamPubTimeCol rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTimeCol( ICFSecProtAuthorization Authorization,
		ICFBamProtTimeCol rec );
	/**
	 *	Delete the TimeCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByTableIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argTableId );

	/**
	 *	Delete the TimeCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByTableIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtTimeColByTableIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByTableIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubTimeColByTableIdxKey argKey );
	/**
	 *	Delete the TimeCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteTimeColByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the TimeCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the TimeCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId );

	/**
	 *	Delete the TimeCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the TimeCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the TimeCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the TimeCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByNextIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the TimeCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 */
	public void protdeleteTimeColByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the TimeCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTimeCol( ICFSecProtAuthorization Authorization,
		ICFBamPubTimeCol rec );
	/**
	 *	Delete the TimeCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByTableIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubTimeColByTableIdxKey argKey );
	/**
	 *	Delete the TimeCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteTimeColByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the TimeCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TimeCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimeColByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );


	/**
	 *	Read the derived TimeCol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTimeCol protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Read the derived TimeCol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubTimeCol pubreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the derived TimeCol record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTimeCol protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Lock the derived TimeCol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTimeCol protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Lock the derived TimeCol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubTimeCol publockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived TimeCol record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTimeCol protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Read all TimeCol instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadProtAllDerived( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the derived TimeCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTimeCol protreadDerivedByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the derived TimeCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTimeCol protreadDerivedByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TimeCol record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadDerivedByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived TimeCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadDerivedByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived TimeCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadDerivedByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TimeCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadDerivedByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived TimeCol record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadDerivedByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TimeCol record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadDerivedByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived TimeCol record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTimeCol[] protreadDerivedByTableIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 TableId );

	/**
	 *	Read the specific TimeCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific TimeCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific TimeCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubTimeCol pubreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific TimeCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific TimeCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubTimeCol publockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific TimeCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimeCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific TimeCol record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TimeCol instances in the database accessible for the Authorization.
	 */
	public ICFBamProtTimeCol[] protreadAllRec( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the specific TimeCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol protreadRecByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the specific TimeCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol protreadRecByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TimeCol record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol[] protreadRecByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific TimeCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol[] protreadRecByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific TimeCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol[] protreadRecByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TimeCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol[] protreadRecByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific TimeCol record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol[] protreadRecByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TimeCol record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol[] protreadRecByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific TimeCol record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeCol[] protreadRecByTableIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 TableId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtTimeCol protmoveRecUp( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtTimeCol protmoveRecDown( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );
}
