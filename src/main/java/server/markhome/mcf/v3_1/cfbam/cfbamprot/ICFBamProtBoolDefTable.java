
// Description: Java 25 protlic DbIO interface for BoolDef.

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
 *	CFBamProtBoolDefTable protlic database interface for BoolDef has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFBamProtBoolDefTable
extends ICFBamProtAtomTable,
	ICFBamPubBoolDefTable
{
	public static final String TABLE_NAME = "BoolDef";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtBoolDef protcreateBoolDef( ICFSecProtAuthorization Authorization,
		ICFBamProtBoolDef rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ICFBamProtBoolDef protcreateBoolDef( ICFSecProtAuthorization Authorization,
		ICFBamPubBoolDef rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtBoolDef protupdateBoolDef( ICFSecProtAuthorization Authorization,
		ICFBamProtBoolDef rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ICFBamProtBoolDef protupdateBoolDef( ICFSecProtAuthorization Authorization,
		ICFBamPubBoolDef rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteBoolDef( ICFSecProtAuthorization Authorization,
		ICFBamProtBoolDef rec );
	/**
	 *	Delete the BoolDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteBoolDefByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the BoolDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 */
	public void protdeleteBoolDefByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the BoolDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 */
	public void protdeleteBoolDefByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId );

	/**
	 *	Delete the BoolDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 */
	public void protdeleteBoolDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the BoolDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 */
	public void protdeleteBoolDefByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the BoolDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 */
	public void protdeleteBoolDefByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the BoolDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByNextIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 */
	public void protdeleteBoolDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the BoolDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 */
	public void protdeleteBoolDefByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argScopeId,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the BoolDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteBoolDef( ICFSecProtAuthorization Authorization,
		ICFBamPubBoolDef rec );
	/**
	 *	Delete the BoolDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteBoolDefByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the BoolDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByUNameIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByScopeIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByNextIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByContPrevIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the BoolDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteBoolDefByContNextIdx( ICFSecProtAuthorization Authorization,
		ICFBamPubValueByContNextIdxKey argKey );


	/**
	 *	Read the derived BoolDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtBoolDef protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Read the derived BoolDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubBoolDef pubreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the derived BoolDef record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtBoolDef protreadDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Lock the derived BoolDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtBoolDef protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );
	/**
	 *	Lock the derived BoolDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamPubBoolDef publockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived BoolDef record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtBoolDef protlockDerived( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );


	/**
	 *	Read all BoolDef instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ICFBamProtBoolDef[] protreadProtAllDerived( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the derived BoolDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtBoolDef protreadDerivedByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the derived BoolDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ICFBamProtBoolDef protreadDerivedByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived BoolDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtBoolDef[] protreadDerivedByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived BoolDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtBoolDef[] protreadDerivedByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived BoolDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtBoolDef[] protreadDerivedByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived BoolDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtBoolDef[] protreadDerivedByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived BoolDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtBoolDef[] protreadDerivedByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived BoolDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ICFBamProtBoolDef[] protreadDerivedByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read the specific BoolDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific BoolDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef protreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read the specific BoolDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubBoolDef pubreadRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific BoolDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific BoolDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamPubBoolDef publockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific BoolDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the BoolDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef protlockRec( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific BoolDef record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific BoolDef instances in the database accessible for the Authorization.
	 */
	public ICFBamProtBoolDef[] protreadAllRec( ICFSecProtAuthorization Authorization );

	/**
	 *	Read the specific BoolDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef protreadRecByIdIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the specific BoolDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef protreadRecByUNameIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific BoolDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef[] protreadRecByScopeIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific BoolDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef[] protreadRecByDefSchemaIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific BoolDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef[] protreadRecByPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific BoolDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef[] protreadRecByNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific BoolDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef[] protreadRecByContPrevIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific BoolDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDef[] protreadRecByContNextIdx( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtBoolDef protmoveRecUp( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public ICFBamProtBoolDef protmoveRecDown( ICFSecProtAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );
}
