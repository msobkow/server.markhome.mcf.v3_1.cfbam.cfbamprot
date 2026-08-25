// Description: Java 25 Object interface for CFBamProt Table.

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

package server.markhome.mcf.v3_1.cfbam.cfbamprotobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;

import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfbam.cfbampub.*;
import server.markhome.mcf.v3_1.cfbam.cfbamprot.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;

public interface ICFBamProtTableObj
	extends ICFBamProtScopeObj
{
	/**
	 *	Get the current edition of this Table instance as a ICFBamProtTableEditObj.
	 *
	 *	@return	The ICFBamProtTableEditObj edition of this instance.
	 */
	ICFBamProtTableEditObj getEditAsTable();

	/**
	 *	Get the ICFBamProtTableTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamProtTableTableObj table cache which manages this instance.
	 */
	ICFBamProtTableTableObj getTableTable();

	/**
	 *	Get the ICFBamProtTable instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ICFBamProtTable instance which currently backs this object.
	 */
	ICFBamProtTable getTableRec();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the SchemaDef key.
	 */
	ICFBamProtSchemaDefObj get$OptionalOrRequired$ContainerSchemaDef();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the SchemaDef key.
	 */
	ICFBamProtSchemaDefObj get$OptionalOrRequired$ContainerSchemaDef( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamProtSchemaDefObj get$OptionalOrRequired$LookupDefSchema();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamProtSchemaDefObj get$OptionalOrRequired$LookupDefSchema( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtRelationObj array of instances referenced by the Relation key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationObj[] array of instances referenced by the Relation key.
	 */
	List<ICFBamProtRelationObj> get$OptionalOrRequired$ComponentsRelation();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtRelationObj array of instances referenced by the Relation key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationObj[] array of instances referenced by the Relation key.
	 */
	List<ICFBamProtRelationObj> get$OptionalOrRequired$ComponentsRelation( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the LookupIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the LookupIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupLookupIndex();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the LookupIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the LookupIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupLookupIndex( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the AltIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the AltIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupAltIndex();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the AltIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the AltIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupAltIndex( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtTableObj instance referenced by the QualTable key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTableObj instance referenced by the QualTable key.
	 */
	ICFBamProtTableObj get$OptionalOrRequired$LookupQualTable();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtTableObj instance referenced by the QualTable key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTableObj instance referenced by the QualTable key.
	 */
	ICFBamProtTableObj get$OptionalOrRequired$LookupQualTable( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtIndexObj array of instances referenced by the Index key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj[] array of instances referenced by the Index key.
	 */
	List<ICFBamProtIndexObj> get$OptionalOrRequired$ComponentsIndex();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtIndexObj array of instances referenced by the Index key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj[] array of instances referenced by the Index key.
	 */
	List<ICFBamProtIndexObj> get$OptionalOrRequired$ComponentsIndex( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the PrimaryIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the PrimaryIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupPrimaryIndex();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the PrimaryIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the PrimaryIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupPrimaryIndex( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtValueObj array of instances referenced by the Columns key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtValueObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamProtValueObj> get$OptionalOrRequired$ComponentsColumns();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtValueObj array of instances referenced by the Columns key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtValueObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamProtValueObj> get$OptionalOrRequired$ComponentsColumns( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtRelationObj array of instances referenced by the ReverseRelations key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationObj[] array of instances referenced by the ReverseRelations key.
	 */
	List<ICFBamProtRelationObj> get$OptionalOrRequired$ChildrenReverseRelations();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtRelationObj array of instances referenced by the ReverseRelations key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationObj[] array of instances referenced by the ReverseRelations key.
	 */
	List<ICFBamProtRelationObj> get$OptionalOrRequired$ChildrenReverseRelations( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtChainObj array of instances referenced by the Chains key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtChainObj[] array of instances referenced by the Chains key.
	 */
	List<ICFBamProtChainObj> get$OptionalOrRequired$ComponentsChains();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtChainObj array of instances referenced by the Chains key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtChainObj[] array of instances referenced by the Chains key.
	 */
	List<ICFBamProtChainObj> get$OptionalOrRequired$ComponentsChains( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtDelTopDepObj array of instances referenced by the DelDep key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtDelTopDepObj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamProtDelTopDepObj> get$OptionalOrRequired$ComponentsDelDep();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtDelTopDepObj array of instances referenced by the DelDep key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtDelTopDepObj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamProtDelTopDepObj> get$OptionalOrRequired$ComponentsDelDep( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtClearTopDepObj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtClearTopDepObj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamProtClearTopDepObj> get$OptionalOrRequired$ComponentsClearDep();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtClearTopDepObj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtClearTopDepObj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamProtClearTopDepObj> get$OptionalOrRequired$ComponentsClearDep( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtServerMethodObj array of instances referenced by the ServerMethods key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtServerMethodObj[] array of instances referenced by the ServerMethods key.
	 */
	List<ICFBamProtServerMethodObj> get$OptionalOrRequired$ComponentsServerMethods();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtServerMethodObj array of instances referenced by the ServerMethods key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtServerMethodObj[] array of instances referenced by the ServerMethods key.
	 */
	List<ICFBamProtServerMethodObj> get$OptionalOrRequired$ComponentsServerMethods( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtTweakObj array of instances referenced by the Tweaks key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTweakObj[] array of instances referenced by the Tweaks key.
	 */
	List<ICFBamProtTweakObj> get$OptionalOrRequired$ComponentsTweaks();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtTweakObj array of instances referenced by the Tweaks key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTweakObj[] array of instances referenced by the Tweaks key.
	 */
	List<ICFBamProtTweakObj> get$OptionalOrRequired$ComponentsTweaks( boolean forceRead );

	/**
	 *	Get the required ICFLibKeyHash256 attribute SchemaDefId.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute SchemaDefId.
	 */
	ICFLibKeyHash256 getRequiredSchemaDefId();

	/**
	 *	Get the optional CFLibDbKeyHash256 attribute DefSchemaId.
	 *
	 *	@return	The optional CFLibDbKeyHash256 attribute DefSchemaId.
	 */
	CFLibDbKeyHash256 getOptionalDefSchemaId();

	/**
	 *	Get the required ICFLibKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute Id.
	 */
	ICFLibKeyHash256 getRequiredId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute DbName.
	 *
	 *	@return	The optional String attribute DbName.
	 */
	String getOptionalDbName();

	/**
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The optional String attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The optional String attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The optional String attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the required boolean attribute PageData.
	 *
	 *	@return	The required boolean attribute PageData.
	 */
	boolean getRequiredPageData();

	/**
	 *	Get the optional CFLibDbKeyHash256 attribute PrimaryIndexId.
	 *
	 *	@return	The optional CFLibDbKeyHash256 attribute PrimaryIndexId.
	 */
	CFLibDbKeyHash256 getOptionalPrimaryIndexId();

	/**
	 *	Get the required String attribute TableClassCode.
	 *
	 *	@return	The required String attribute TableClassCode.
	 */
	String getRequiredTableClassCode();

	/**
	 *	Get the optional CFLibDbKeyHash256 attribute LookupIndexId.
	 *
	 *	@return	The optional CFLibDbKeyHash256 attribute LookupIndexId.
	 */
	CFLibDbKeyHash256 getOptionalLookupIndexId();

	/**
	 *	Get the optional CFLibDbKeyHash256 attribute AltIndexId.
	 *
	 *	@return	The optional CFLibDbKeyHash256 attribute AltIndexId.
	 */
	CFLibDbKeyHash256 getOptionalAltIndexId();

	/**
	 *	Get the optional CFLibDbKeyHash256 attribute QualifyingTableId.
	 *
	 *	@return	The optional CFLibDbKeyHash256 attribute QualifyingTableId.
	 */
	CFLibDbKeyHash256 getOptionalQualifyingTableId();

	/**
	 *	Get the required boolean attribute IsInstantiable.
	 *
	 *	@return	The required boolean attribute IsInstantiable.
	 */
	boolean getRequiredIsInstantiable();

	/**
	 *	Get the required boolean attribute HasHistory.
	 *
	 *	@return	The required boolean attribute HasHistory.
	 */
	boolean getRequiredHasHistory();

	/**
	 *	Get the required boolean attribute HasAuditColumns.
	 *
	 *	@return	The required boolean attribute HasAuditColumns.
	 */
	boolean getRequiredHasAuditColumns();

	/**
	 *	Get the required boolean attribute IsMutable.
	 *
	 *	@return	The required boolean attribute IsMutable.
	 */
	boolean getRequiredIsMutable();

	/**
	 *	Get the required boolean attribute IsServerOnly.
	 *
	 *	@return	The required boolean attribute IsServerOnly.
	 */
	boolean getRequiredIsServerOnly();

	/**
	 *	Get the required ICFBamPubSchema.LoaderBehaviourEnum attribute LoaderBehaviour.
	 *
	 *	@return	The required ICFBamPubSchema.LoaderBehaviourEnum attribute LoaderBehaviour.
	 */
	ICFBamPubSchema.LoaderBehaviourEnum getRequiredLoaderBehaviour();

	/**
	 *	Get the required ICFBamPubSchema.SecScopeEnum attribute SecScope.
	 *
	 *	@return	The required ICFBamPubSchema.SecScopeEnum attribute SecScope.
	 */
	ICFBamPubSchema.SecScopeEnum getRequiredSecScope();

	/**
	 *	Get the required ICFBamPubSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The required ICFBamPubSchema.CodeVisibilityEnum attribute CodeVis.
	 */
	ICFBamPubSchema.CodeVisibilityEnum getRequiredCodeVis();

}
