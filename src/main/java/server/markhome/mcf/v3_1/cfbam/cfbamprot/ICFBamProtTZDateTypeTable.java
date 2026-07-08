
// Description: Java 25 protlic DbIO interface for TZDateType.

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
 *	CFBamProtTZDateTypeTable protlic database interface for TZDateType has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFBamProtTZDateTypeTable
extends ICFBamProtTZDateDefTable,
	ICFBamPubTZDateTypeTable
{
	public static final String TABLE_NAME = "TZDateType";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtTZDateType protcreateTZDateType( ICFSecProtAuthorization Authorization,
		ICFBamProtTZDateType rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtTZDateType protcreateTZDateType( ICFSecProtAuthorization Authorization,
		ICFBamPubTZDateType rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtTZDateType protupdateTZDateType( ICFSecProtAuthorization Authorization,
		ICFBamProtTZDateType rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtTZDateType protupdateTZDateType( ICFSecProtAuthorization Authorization,
		ICFBamPubTZDateType rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTZDateType( ICFSecProtAuthorization Authorization,
		ICFBamProtTZDateType rec );
	/**
	 *	Delete the TZDateType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argSchemaDefId );

	/**
	 *	Delete the TZDateType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtTZDateTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubTZDateTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TZDateType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteTZDateTypeByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the TZDateType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the TZDateType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId );

	/**
	 *	Delete the TZDateType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the TZDateType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the TZDateType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the TZDateType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByNextIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the TZDateType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 */
	public void protdeleteTZDateTypeByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the TZDateType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTZDateType( ICFSecProtAuthorization Authorization,
		ICFBamPubTZDateType rec );
	/**
	 *	Delete the TZDateType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeBySchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubTZDateTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TZDateType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteTZDateTypeByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the TZDateType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TZDateType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZDateTypeByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );


	/**
	 *	Read the derived TZDateType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTZDateType protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Read the derived TZDateType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubTZDateType pubreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the derived TZDateType record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTZDateType protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Lock the derived TZDateType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTZDateType protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Lock the derived TZDateType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubTZDateType publockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived TZDateType record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTZDateType protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Read all TZDateType instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadProtAllDerived( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the derived TZDateType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTZDateType protreadDerivedByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the derived TZDateType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtTZDateType protreadDerivedByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TZDateType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadDerivedByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived TZDateType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadDerivedByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived TZDateType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadDerivedByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TZDateType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadDerivedByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived TZDateType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadDerivedByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TZDateType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadDerivedByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived TZDateType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtTZDateType[] protreadDerivedBySchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Read the specific TZDateType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific TZDateType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific TZDateType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubTZDateType pubreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific TZDateType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific TZDateType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubTZDateType publockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific TZDateType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZDateType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific TZDateType record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TZDateType instances in the database accessible for the Authorization.
	 */
	public ICFBamProtTZDateType[] protreadAllRec( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the specific TZDateType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType protreadRecByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the specific TZDateType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType protreadRecByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TZDateType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType[] protreadRecByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific TZDateType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType[] protreadRecByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific TZDateType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType[] protreadRecByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TZDateType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType[] protreadRecByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific TZDateType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType[] protreadRecByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TZDateType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType[] protreadRecByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific TZDateType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateType[] protreadRecBySchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtTZDateType protmoveRecUp( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtTZDateType protmoveRecDown( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );
}
