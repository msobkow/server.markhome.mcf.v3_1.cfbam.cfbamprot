
// Description: Java 25 protlic DbIO interface for Int64Type.

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
 *	CFBamProtInt64TypeTable protlic database interface for Int64Type has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFBamProtInt64TypeTable
extends ICFBamProtInt64DefTable,
	ICFBamPubInt64TypeTable
{
	public static final String TABLE_NAME = "Int64Type";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtInt64Type protcreateInt64Type( ICFSecProtAuthorization Authorization,
		ICFBamProtInt64Type rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtInt64Type protcreateInt64Type( ICFSecProtAuthorization Authorization,
		ICFBamPubInt64Type rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtInt64Type protupdateInt64Type( ICFSecProtAuthorization Authorization,
		ICFBamProtInt64Type rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtInt64Type protupdateInt64Type( ICFSecProtAuthorization Authorization,
		ICFBamPubInt64Type rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteInt64Type( ICFSecProtAuthorization Authorization,
		ICFBamProtInt64Type rec );
	/**
	 *	Delete the Int64Type instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argSchemaDefId );

	/**
	 *	Delete the Int64Type instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtInt64TypeBySchemaIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubInt64TypeBySchemaIdxKey argKey );
	/**
	 *	Delete the Int64Type instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteInt64TypeByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the Int64Type instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the Int64Type instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId );

	/**
	 *	Delete the Int64Type instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the Int64Type instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the Int64Type instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the Int64Type instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByNextIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the Int64Type instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 */
	public void protdeleteInt64TypeByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the Int64Type instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteInt64Type( ICFSecProtAuthorization Authorization,
		ICFBamPubInt64Type rec );
	/**
	 *	Delete the Int64Type instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubInt64TypeBySchemaIdxKey argKey );
	/**
	 *	Delete the Int64Type instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteInt64TypeByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the Int64Type instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the Int64Type instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteInt64TypeByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );


	/**
	 *	Read the derived Int64Type record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtInt64Type protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Read the derived Int64Type record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubInt64Type pubreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the derived Int64Type record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtInt64Type protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Lock the derived Int64Type record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtInt64Type protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Lock the derived Int64Type record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubInt64Type publockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived Int64Type record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtInt64Type protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Read all Int64Type instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadProtAllDerived( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the derived Int64Type record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtInt64Type protreadDerivedByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the derived Int64Type record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtInt64Type protreadDerivedByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived Int64Type record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadDerivedByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived Int64Type record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadDerivedByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived Int64Type record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadDerivedByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived Int64Type record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadDerivedByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived Int64Type record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadDerivedByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived Int64Type record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadDerivedByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived Int64Type record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtInt64Type[] protreadDerivedBySchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Read the specific Int64Type record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific Int64Type record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific Int64Type record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubInt64Type pubreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific Int64Type record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific Int64Type record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubInt64Type publockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific Int64Type record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int64Type instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific Int64Type record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Int64Type instances in the database accessible for the Authorization.
	 */
	public ICFBamProtInt64Type[] protreadAllRec( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the specific Int64Type record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type protreadRecByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the specific Int64Type record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type protreadRecByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific Int64Type record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type[] protreadRecByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific Int64Type record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type[] protreadRecByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific Int64Type record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type[] protreadRecByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific Int64Type record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type[] protreadRecByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific Int64Type record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type[] protreadRecByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific Int64Type record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type[] protreadRecByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific Int64Type record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64Type[] protreadRecBySchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtInt64Type protmoveRecUp( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtInt64Type protmoveRecDown( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );
}
